(ns service-test
  (:require [clojure.test :all]
            [state-flow.api :refer [defflow]]))

(def t-routes [["/concat" {:get {:summary "concat two strings based on queryparameters"
                                 :parameters {:query []}
                                 :handler (fn [{{{:keys [x y]} :query} :parameters}])}}]])
