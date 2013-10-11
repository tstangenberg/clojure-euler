(ns euler.util
  (:require
   [clojure.core.reducers :as r]))

(defn sum
  [collection]
  (r/fold + collection))
