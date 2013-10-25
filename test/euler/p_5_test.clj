(ns euler.p_5_test
  (:require
    [clojure.test :refer :all]
    [euler.p_5 :refer :all]))

(deftest smallest-multiple
  (is (= 2520 (sm (range 1 11)))))
