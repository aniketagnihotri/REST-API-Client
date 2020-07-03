# API-Interface

A simple Spring interface written to send GET requests to multiple APIs.

The Yelp package included three classes which send GET requests to Yelp's Fusion API for a number of local business results in a city or area, which are returned and published to a URL in JSON format. These parameters are defined by the user and published on the URL /yelp/{city}/{result_limit}. Other API interface code is also written, sending requests to ICNDb.com's API for Chuck Norris jokes. Any numbered joke can be retreived from this API at the URL /joke/{joke_number}, and is similarly returned and published to the URL in JSON format.
