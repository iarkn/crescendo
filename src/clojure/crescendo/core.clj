(ns crescendo.core
  (:require [crescendo.arc :as arc])
  (:import (arc Core Events)
           (arc.func Cons)
           (arc.util Log Time)
           (mindustry.game EventType$ClientLoadEvent)
           (mindustry.ui.dialogs BaseDialog)))

(defn -main []
  (Events/on
   EventType$ClientLoadEvent
   (arc/cons1
    (fn [_]
      (Time/runTask
       10
       #(arc/cons1
         (let [dialog (BaseDialog. "horse")
               cont   (.cont dialog)]
           (.row (.add cont "horse"))
           (doto (.image cont (.find Core/atlas "router"))
             (.pad 16)
             .row)
           (doto dialog
             .addCloseButton
             .show))))))))

(defn -init [])

(defn -loadContent [])
