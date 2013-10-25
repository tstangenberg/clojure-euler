(ns euler.p_3_test
  (:use midje.sweet)
  (:require
    [euler.p_3 :refer :all]))

(fact "max-prime-factor works"
  (max-prime-factor 13195) => 29
  )
