(ns euler.p_4_test
  (:use midje.sweet)
  (:require
    [euler.p_4 :refer :all]))

(fact "max-palidrome-recursive works"
  (max-palidrome-recursive 10 99) => 9009
  )


(fact "max-palidrome-for-loop works"
  (max-palidrome-for-loop 10 99) => 9009
  )