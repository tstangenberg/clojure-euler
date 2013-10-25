(ns euler.p_4
  (:require
    [euler.util :as u]))


(defn palidrome?
  [p]
  (let [a (reverse (str p))
        b (reverse a)]
    (= a b)))


(defn max-palidrome
  [a b]
  (if (and (palidrome? b) (> b a))
    b
    a
  ))

(defn solution-with-recur
  " Largest palindrome product
    Problem 4
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    Find the largest palindrome made from the product of two 3-digit numbers.
    http://projecteuler.net/problem=4"
  []
  (loop [a 100
         b 100
         m 0]
    (let [max (max-palidrome m (* a b))]
      (if (> a 999)
        max
        (if (> b 999)
          (recur (inc a) 100 max)
          (recur a (inc b) max))))))

(defn solution-with-loop
  " Largest palindrome product
    Problem 4
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    Find the largest palindrome made from the product of two 3-digit numbers.
    http://projecteuler.net/problem=4"
  []
  (apply max
    (for [a (range 100 1000)
          b (range 100 1000)
          :let [palidrome (* a b)]
          :when (palidrome? palidrome)]
      palidrome)))

(println "solution-with-loop")
(time (solution-with-loop))
(println "")
(println "solution-with-recur")
(time (solution-with-recur))

