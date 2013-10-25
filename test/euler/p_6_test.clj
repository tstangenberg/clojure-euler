(ns euler.p_6_test
  (:use midje.sweet)
  (:require
    [euler.p_6 :refer :all]))

(fact "smallest-multiple works"
  (sd (range 1 11)) => 2640
  )