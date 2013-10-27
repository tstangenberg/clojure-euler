(ns euler.p_9_test
  (:use midje.sweet)
  (:require
    [euler.p_9 :refer :all]))

(fact "p9 works"
  (spt 12) => [3 4 5]
  )