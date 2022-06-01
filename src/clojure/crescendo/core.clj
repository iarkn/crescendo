(ns crescendo.core
  (:import (arc.util Log))

(defn -main []
  (Log/info "main"))

(defn -init []
  (Log/info "Hello, world!"))

(defn -loadContent []
  (Log/info "Not loading anything."))
