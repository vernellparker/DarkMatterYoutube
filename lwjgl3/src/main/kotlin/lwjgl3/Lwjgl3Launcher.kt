package lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import darkmatter.DarkMatter
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration

/** Launches the desktop (LWJGL3) application.  */
    fun main() {
    Lwjgl3Application(DarkMatter(), Lwjgl3ApplicationConfiguration().apply{
            setTitle("DarkMatterYoutube")
            useVsync(true)
            setWindowedMode(640, 480)
            setWindowIcon("libgdx128.png", "libgdx64.png", "libgdx32.png", "libgdx16.png")
        })
    }
