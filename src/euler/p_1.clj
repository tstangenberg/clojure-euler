(ns euler.p_1
  (:require [euler.util :as u]))

(defn- multiple-of
  [a b]
  (= (mod a b) 0))

(def numbers
  (for [n (range 1000)
        :when (or (multiple-of n 3)
                  (multiple-of n 5))]
    n))

(def solution
  "http://projecteuler.net/problem=1"
  (u/sum numbers))

