(ns euler.p_5_test
  (:use midje.sweet)
  (:require
    [euler.p_5 :refer :all]))

(fact "smallest-multiple works"
  (sm (range 1 11)) => 2520
  )