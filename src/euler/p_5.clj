(ns euler.p_5)

(defn smallest-multiple?
  [n c]
    (if (empty? c)
      true
      (if (= (mod n (first c)) 0)
        (recur n (rest c))
        false)))

(defn sm
  [r]
  (loop [n 1]
    (if (smallest-multiple? n r)
      n
      (recur (inc n)))))

(defn solution
  " Smallest multiple
    Problem 5
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    http://projecteuler.net/problem=5"
  []
  (sm (range 1 21)))
