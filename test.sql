SELECT MAX(score) FROM score GROUP BY s_id
SELECT * FROM secoe as s, (SELECT 最高分 FROM score GROUP BY s_id) as tb, where sstudent = tb.student, s.score = tb.score, 