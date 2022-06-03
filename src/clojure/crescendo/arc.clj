(ns crescendo.arc
  (:import (arc.func Cons Cons2 Cons3 Cons4)))

(defn cons1 [func]
  (reify Cons
    (get [this a] (func a))))

(defn cons2 [func]
  (reify Cons2
    (get [this a b] (func a b))))

(defn cons3 [func]
  (reify Cons3
    (get [this a b c] (func a b c))))

(defn cons4 [func]
  (reify Cons4
    (get [this a b c d] (func a b c d))))
