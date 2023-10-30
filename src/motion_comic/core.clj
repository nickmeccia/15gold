(ns motion_comic.core
  (:use
    [compojure.core :only (defroutes GET)]
    [compojure.route :only (not-found)]
    [joodo.middleware.view-context :only (wrap-view-context)]
    [joodo.views :only (render-template render-html)]
    [joodo.controllers :only (controller-router)]))

(defroutes motion_comic-routes
  (GET "/" [] (render-template "index"))
  (controller-router 'motion_comic.controller)
  (not-found (render-template "not_found" :template-root "motion_comic/view" :ns `motion_comic.view.view-helpers)))

(def app-handler
  (->
    motion_comic-routes
    (wrap-view-context :template-root "motion_comic/view" :ns `motion_comic.view.view-helpers)))
 
