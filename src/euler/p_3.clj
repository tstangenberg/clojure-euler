(ns euler.p_3
  (:require
   [euler.util :as u]
   [clojure.contrib.lazy-seqs :refer [primes]]))


(defn divisible?
  [n d]
  (zero? (mod n d)))

(defn prime?
" Tests for primailty "
[n]
(if (or (= n 2) (= n 3))
  true
  (if (or
        (divisible? n 2)
        (< n 2))
    false
    (loop [i 3]
      (if (divisible? n i)
        false
        (if (> i (. Math (sqrt n)))
          true
          (recur (+ i 2))))))))


(defn max-prime-factor
  "takes a number and returns the largest prime factor
  as the largest prime factor will have the lowest factor result, the method starts with factor result = 1 and increments it until the resulting factor is a prime number"
  [number]
  (loop [factor-result 1]
    (if (and (divisible? number factor-result) (prime? (/ number factor-result)))
      (/ number factor-result)
      (recur (inc factor-result))
    ))
  )


(defn solution
" Largest prime factor
  Problem 3
  The prime factors of 13195 are 5, 7, 13 and 29.
  What is the largest prime factor of the number 600851475143 ?
  http://projecteuler.net/problem=3"
  []
  (max-prime-factor 600851475143))




;; found on the net http://blog.fogus.me/2009/09/09/clojure-golf-episode-2-largest-prime-actor/
;; but that's too advanced for me to understand....
(defn lpf
  "Takes a number n and a starting number d > 1
   and calculates the largest prime factor of n
   starting at number d.
   usage: (lpf 364362978 2) => 8675309"
  [n d]
  (if (> d n)
    (- d 1)
    (recur
      (#(if (zero? (rem % d))
          (recur (/ % d))
          %)
        n)
      (inc d))))




