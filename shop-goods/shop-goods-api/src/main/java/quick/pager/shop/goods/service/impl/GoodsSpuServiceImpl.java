package quick.pager.shop.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;
import org.springframework.stereotype.Service;
import quick.pager.shop.goods.mapper.GoodsSpuMapper;
import quick.pager.shop.goods.model.GoodsSpu;
import quick.pager.shop.goods.request.spu.GoodsSpuPageRequest;
import quick.pager.shop.goods.request.spu.GoodsSpuSaveRequest;
import quick.pager.shop.goods.service.GoodsSpuService;
import quick.pager.shop.response.Response;
import quick.pager.shop.service.impl.ServiceImpl;
import quick.pager.shop.utils.BeanCopier;
import quick.pager.shop.utils.DateUtils;

/**
 * <p>
 * 商品spu 服务实现类
 * </p>
 *
 * @author Siguiyang
 * @since 2019-10-07
 */
@Service
public class GoodsSpuServiceImpl extends ServiceImpl<GoodsSpuMapper, GoodsSpu> implements GoodsSpuService {

    @Override
    public Response<Long> create(GoodsSpuSaveRequest request) {
        GoodsSpu spu = this.conv(request);
        spu.setCreateTime(DateUtils.dateTime());
        spu.setDeleteStatus(Boolean.FALSE);
        this.baseMapper.insert(spu);
        return new Response<>(spu.getId());
    }

    @Override
    public Response<Long> modify(GoodsSpuSaveRequest request) {
        GoodsSpu spu = this.conv(request);
        this.baseMapper.updateById(spu);
        return new Response<>(spu.getId());
    }

    @Override
    public Response<List<GoodsSpu>> queryPage(GoodsSpuPageRequest request) {
        QueryWrapper<GoodsSpu> qw = new QueryWrapper<>();

        return this.toPage(request.getPage(), request.getPageSize(), qw);
    }

    private GoodsSpu conv(GoodsSpuSaveRequest request) {
        GoodsSpu spu = new GoodsSpu();
        BeanCopier.create(request, spu).copy();
        return spu;
    }

}
