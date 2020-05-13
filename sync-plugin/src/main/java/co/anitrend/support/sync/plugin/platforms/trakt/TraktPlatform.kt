package co.anitrend.support.sync.plugin.platforms.trakt

import co.anitrend.support.sync.plugin.core.ISyncPlatform

data class TraktPlatform(
    val tmdbId: Long,
    override val id: Long,
    override val progress: Int
) : ISyncPlatform