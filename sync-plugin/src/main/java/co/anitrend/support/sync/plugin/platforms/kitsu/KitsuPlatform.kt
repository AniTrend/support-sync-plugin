package co.anitrend.support.sync.plugin.platforms.kitsu

import co.anitrend.support.sync.plugin.core.ISyncPlatform

data class KitsuPlatform(
    override val id: Long,
    override val progress: Int
) : ISyncPlatform