(ns euler.p_10
  (:require [clojure.contrib.lazy-seqs :refer [primes]]
            [euler.util :as u]))

(defn sum-of-primes-below
  [number]
  (u/sum (take-while #(< % number) primes))
  )

(defn solution
  " Summation of primes
    Problem 10
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    Find the sum of all the primes below two million.

    http://projecteuler.net/problem=10"
  []
  (sum-of-primes-below 2000000)
  )
