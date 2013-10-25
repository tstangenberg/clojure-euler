(ns euler.p_2
  (:require
   [euler.util :as u]))

(defn fib-seq []
  ((fn rfib [a b]
       (cons a (lazy-seq (rfib b (+ a b)))))
    1 2))

(def numbers
  (filter even? (take-while #(< % 4000000) (fib-seq))))

(def solution
  "http://projecteuler.net/problem=2"
  (u/sum numbers))






