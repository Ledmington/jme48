package jme48;

import com.jme3.app.SimpleApplication;
import com.jme3.system.AppSettings;

import java.util.logging.Logger;

public class App extends SimpleApplication {

    private final Logger log = Logger.getLogger("main");

    public static void main(final String[] args){
        System.out.println("Running on " + Runtime.version());

        final AppSettings settings = new AppSettings(true);
        settings.setFrameRate(60);
        settings.setCenterWindow(true);
        settings.setWidth(700);
        settings.setHeight(700);
        settings.setTitle("jME 2048");

        App app = new App();
        app.setSettings(settings);
        app.setDisplayFps(true);
        app.setPauseOnLostFocus(false);
        app.setShowSettings(false);
        app.setDisplayStatView(false);
        app.start();
    }

    @Override
    public void simpleInitApp() {
        /*
        Box b = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", b);
        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setTexture("ColorMap", assetManager.loadTexture("Interface/Logo/Monkey.jpg"));
        geom.setMaterial(mat);
        rootNode.attachChild(geom);
        */

        cam.setParallelProjection(true);
        cam.setFrustumLeft(-10);
        cam.setFrustumRight(10);
        cam.setFrustum(0.1f, 100, -10, 10, 10, -10);

        /*
        NiftyJmeDisplay niftyDisplay = NiftyJmeDisplay.newNiftyJmeDisplay(
                assetManager,
                inputManager,
                audioRenderer,
                guiViewPort);
        Nifty nifty = niftyDisplay.getNifty();
        MainMenuController startScreen = new MainMenuController(this);
        nifty.fromXml("interfaces/menu.xml", "start", startScreen);

        // attach the nifty display to the gui view port as a processor
        guiViewPort.addProcessor(niftyDisplay);
*/
        // disable the fly cam
        flyCam.setEnabled(false);
        flyCam.setDragToRotate(true);
        inputManager.setCursorVisible(true);
    }

    @Override
    public void simpleUpdate(float tpf) {
        //System.out.println("Fps: " + (1/tpf));
    }
}