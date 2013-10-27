(ns euler.p_9)


(defn spt
  "Special Pythagorean triplet"
  [sum]
  (first
    (for [a (range 1 sum)
        b (range 1 sum)
        c (range 1 sum)
        :when (and
                (< a b c)
                (= (+ a b c) sum)
                (= (+ (* a a) (* b b)) (* c c)))]
    [a b c]
    )
  ))

(defn solution
  " Special Pythagorean triplet
    Problem 9
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

    a^2 + b^2 = c^2
    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.

    http://projecteuler.net/problem=8"
  []
  (let [triplet (spt 1000)
        a (first triplet)
        b (second triplet)
        c (nth triplet 2)]
    (* a b c))
  )
