-- Write your PostgreSQL query statement below

select t.tweet_id
from Tweets t
where char_length(t.content) > 15;