(ns euler.p_7
  (:require
    [clojure.contrib.lazy-seqs :refer [primes]]
    ))

(defn nth-prime
  [n]
  (nth primes (dec n)))

(defn solution
  " 10001st prime
    Problem 7
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

    What is the 10 001st prime number?
    http://projecteuler.net/problem=7"
  []
  (nth-prime 10001)
  )
