JsonObjectRequest request = new JsonObjectRequest(
    Request.Method.POST, "myurl.com", null,
    new Response.Listener<JSONObject>() {
        @Override
        public void onResponse(JSONObject response) {
            //...
        }
    },
    new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            //...
        }
    })
    {
        @Override
        protected Map<String,String> getParams() {
            // something to do here ??
            return params;
        }

        @Override
        public Map<String, String> getHeaders() throws AuthFailureError {
            // something to do here ??
            return params;
        }
    };