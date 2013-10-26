(ns euler.p_8_test
  (:use midje.sweet)
  (:require
    [euler.p_8 :refer :all]))

(fact "p8 works"
  (largest-product-in-series
    "1234567890"
    3) => (* 7 8 9)
  )