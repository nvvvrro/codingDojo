Use friends;

#base query
SELECT u.first_name, u.last_name, 
       u2.first_name as friend_first_name, u2.last_name as friend_last_name 
FROM users u
LEFT JOIN friendships f
ON f.user_id=u.id
INNER JOIN users as u2 
ON u2.id= f.friend_id; 

#1.-
SELECT u.first_name, u.last_name, 
	   u2.first_name as friend_first_name, u2.last_name as friend_last_name 
FROM users u
LEFT JOIN friendships f
ON f.friend_id=u.id
INNER JOIN users as u2 
ON u2.id= f.user_id
WHERE u.first_name="Kermit";

#2
SELECT u.first_name, u.last_name, 
	   u2.first_name as friend_first_name, u2.last_name as friend_last_name, 
       COUNT(f.friend_id) as friendships_total
FROM users u
LEFT JOIN friendships f
ON f.user_id=u.id
INNER JOIN users as u2 
ON u2.id= f.friend_id
GROUP BY u.id;

#3
SELECT user_id, CONCAT(u.first_name," ",u.last_name) as name, 
       MAX(total_friend) as number_friends
FROM (SELECT user_id, COUNT(friend_id) as total_friend 
      FROM friendships
      GROUP BY user_id) as tempFriendships 
INNER JOIN users u
ON tempFriendships.user_id=u.id;

#4
INSERT INTO users (id, first_name, last_name, created_at) 
VALUES (NULL, "Juan", "Perez", NOW());

INSERT INTO friendships(id, user_id, friend_id, created_at) 
VALUES (NULL,6,2,NOW()),
	   (NULL,6,4,NOW()),
       (NULL,6,5,NOW());

#5
SELECT u.first_name, u.last_name, 
	   u2.first_name as friend_first_name, u2.last_name as friend_last_name 
FROM users u
LEFT JOIN friendships f
ON f.friend_id=u.id
INNER JOIN users as u2 
ON u2.id= f.user_id
WHERE u.first_name="Eli" 
ORDER BY u2.first_name ASC;

#6
SELECT f.user_id, u.first_name, u.last_name, 
	   u2.first_name as friend_first_name, u2.last_name as friend_last_name, friend_id
FROM users u
LEFT JOIN friendships f
ON f.user_id=u.id
INNER JOIN users as u2 
ON u2.id= f.friend_id
WHERE u.first_name="Eli" && u2.first_name="Marky";

DELETE FROM friendships
WHERE user_id=2 AND friend_id = 5;

#7
SELECT u.first_name, u.last_name, 
       u2.first_name as friend_first_name, u2.last_name as friend_last_name 
FROM users u
LEFT JOIN friendships f
ON f.user_id=u.id
INNER JOIN users as u2 
ON u2.id= f.friend_id;


