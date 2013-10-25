(ns euler.p_7_test
  (:use midje.sweet)
  (:require
    [euler.p_7 :refer :all]))

(fact "smallest-multiple works"
  (nth-prime 6) => 13
  )