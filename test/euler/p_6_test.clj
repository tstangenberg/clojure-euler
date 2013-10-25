(ns euler.p_6_test
  (:require
    [clojure.test :refer :all]
    [euler.p_6 :refer :all]))

(deftest square-difference
  (is (= 2640 (sd (range 1 11)))))
