(ns euler.p_6
  (:require
    [euler.util :as u]
    ))

(defn square-of-sum
  [r]
  (let [sum (u/sum r)]
    (* sum sum)))


(defn sum-of-squares
  [r]
  (u/sum (map #(* % %) r)))

(defn sd
  [r]
  (-
    (square-of-sum r)
    (sum-of-squares r)))

(defn solution
  " Sum square difference
    Problem 6
    The sum of the squares of the first ten natural numbers is,

    1ˆ2 + 2ˆ2 + ... + 10ˆ2 = 385
    The square of the sum of the first ten natural numbers is,

    (1 + 2 + ... + 10)^2 = 55^2 = 3025
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    http://projecteuler.net/problem=6"
  []
  (sd (range 1 101))
  )
