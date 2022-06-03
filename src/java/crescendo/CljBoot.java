package crescendo;

import clojure.java.api.*;
import clojure.lang.*;

import mindustry.mod.*;

/** Class for bootstrapping Clojure to actually load the mod. */
public class CljBoot extends Mod {
    public static final String NAMESPACE = CljBoot.class.getPackageName() + ".core";

    public CljBoot() {
        // TODO: Check if this destroys everything
        ClassLoader cl = getClass().getClassLoader();
        Thread.currentThread().setContextClassLoader(cl);

        IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read(NAMESPACE));

        IFn main = Clojure.var(NAMESPACE, "-main");
        main.invoke();
    }

    @Override
    public void init() {
        IFn init = Clojure.var(NAMESPACE, "-init");
        init.invoke();
    }

    @Override
    public void loadContent() {
        IFn loadContent = Clojure.var(NAMESPACE, "-loadContent");
        loadContent.invoke();
    }
}
