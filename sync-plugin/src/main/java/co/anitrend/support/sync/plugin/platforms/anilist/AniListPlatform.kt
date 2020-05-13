package co.anitrend.support.sync.plugin.platforms.anilist

import co.anitrend.support.sync.plugin.core.ISyncPlatform

data class AniListPlatform(
    val malId: Long,
    override val id: Long,
    override val progress: Int
) : ISyncPlatform