/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

object Versions {
    object Android {
        const val compileSdk = 28
        const val targetSdk = 28
        const val minSdk = 16
    }

    const val kotlin = "1.3.70"
    const val mokoUnits = "0.3.1"
    private const val androidArch = "2.0.0"

    object Plugins {
        const val android = "3.6.1"

        const val kotlin = Versions.kotlin
        const val mokoUnits = Versions.mokoUnits
    }

    object Libs {
        object Android {
            const val appCompat = "1.1.0"
            const val recyclerView = "1.0.0"
            const val lifecycle = androidArch
        }

        object MultiPlatform {
            const val coroutines = "1.3.4"
            const val mokoPaging = "0.3.1"
            const val mokoMvvm = "0.6.0"
            const val mokoUnits = Versions.mokoUnits
        }
    }

    object Tests {
        const val androidCoreTesting = androidArch
    }
}
