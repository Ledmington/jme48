package jme48;

import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;

import javax.annotation.Nonnull;

public class GameScreenController implements ScreenController {
    @Override
    public void bind(@Nonnull Nifty nifty, @Nonnull Screen screen) {
        System.out.println("GameScreen bind");
    }

    @Override
    public void onStartScreen() {
        System.out.println("GameScreen onStartScreen");
    }

    @Override
    public void onEndScreen() {
        System.out.println("GameScreen onEndScreen");
    }
}
