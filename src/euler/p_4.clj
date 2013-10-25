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

(defn max-palidrome-recursive
  [from to]
  (loop [a from
         b from
         m 0]
    (let [max (max-palidrome m (* a b))]
      (if (> a to)
        max
        (if (> b to)
          (recur (inc a) from max)
          (recur a (inc b) max))))))

(defn solution-with-recur
  " Largest palindrome product
    Problem 4
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    Find the largest palindrome made from the product of two 3-digit numbers.
    http://projecteuler.net/problem=4"
  []
  (max-palidrome-recursive 100 999))


(defn max-palidrome-for-loop
  [from to]
  (apply max
    (for [a (range from (inc to))
          b (range from (inc to))
          :let [palidrome (* a b)]
          :when (palidrome? palidrome)]
      palidrome)))

(defn solution
  " Largest palindrome product
    Problem 4
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    Find the largest palindrome made from the product of two 3-digit numbers.
    http://projecteuler.net/problem=4"
  []
  (println "solution-with-for-loop")
  (let [s (time (max-palidrome-for-loop 100 999))]
    (println "")
    (println "solution-with-recur")
    (time (max-palidrome-recursive 100 999))
  s)
)

