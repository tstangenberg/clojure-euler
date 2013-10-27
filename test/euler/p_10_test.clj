(ns euler.p_10_test
  (:use midje.sweet)
  (:require
    [euler.p_10 :refer :all]))

(fact "p10 works"
  ;2 + 3 + 5 + 7 = 17
  (sum-of-primes-below 10) => 17
  )