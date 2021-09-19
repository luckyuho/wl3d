package com.hi.dhl.wl3d.data.mapper

import com.hi.dhl.wl3d.data.entity.FavoriteImageEntity
import com.hi.dhl.wl3d.model.DataItemModel

/**
 * <pre>
 *     author: dhl
 *     date  : 2020/7/11
 *     desc  :
 * </pre>
 */
class InfoEntity2InfoModelMapper : Mapper<FavoriteImageEntity, DataItemModel> {

    override fun map(input: FavoriteImageEntity): DataItemModel =
        DataItemModel(
            name = input.name,
            accountId = input.accountId,
            createdAt = input.createdAt,
            description = input.description,
            lrThumbnailUrl = input.lrThumbnailUrl,
            thumbnailUrl = input.thumbnailUrl,
            updatedAt = input.updatedAt
        )

}