package darkmatter.screen

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.Screen
import darkmatter.DarkMatter
import ktx.app.KtxScreen
import ktx.log.logger
import javax.swing.Renderer

private val LOG = logger<FirstScreen>()

class FirstScreen(game: DarkMatter) : DarkMatterScreen(game) {
    override fun show() {
        LOG.debug { "First screen is shown" }
    }

    override fun render(delta: Float) {
        if(Gdx.input.isKeyJustPressed(Input.Keys.NUM_2)){
              game.setScreen<SecondScreen>()
        }
    }
}