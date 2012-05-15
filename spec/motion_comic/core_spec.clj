(ns motion_comic.core-spec
  (:use
    [speclj.core]
    [joodo.spec-helpers.controller]
    [motion_comic.core]))

(describe "motion_comic"

  (with-mock-rendering)
  (with-routes app-handler)

  (it "handles home page"
    (let [result (do-get "/")]
      (should= 200 (:status result))
      (should= "index" @rendered-template)))
  )

(run-specs)
