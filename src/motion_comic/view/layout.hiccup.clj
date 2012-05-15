(doctype :html5)
[:html
 [:head
  [:meta {:http-equiv "Content-Type" :content "text/html" :charset "iso-8859-1"}]
  [:title "motion_comic"]
  (include-css "/stylesheets/motion_comic.css")
  (include-js "/javascript/motion_comic.js")]
 [:body
  (eval (:template-body joodo.views/*view-context*))
]]