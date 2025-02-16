package edu.cmcc.cpt.cpt_245_week_4.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import edu.cmcc.cpt.cpt_245_week_4.Student.Student;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassesController {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping
    public List<Classes> getAllClasses() {
        String sql = "SELECT * FROM classes;";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Classes classes = new classes();
            classes.setClassCode(rs.getString("class_code"));
            classes.setClassName(rs.getString("class_name"));

            return classes;
        });
    }

    @GetMapping("/{class_code}")
    public Classes getClassesByClassCode(@PathVariable String class_code) {
        String sql = "SELECT * FROM classes WHERE class_code = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{class_code}, (rs, rowNum) -> {
            Classes classes = new Classes();
            classes.setClassCode(rs.getString("class_code"));
            return classes;
        });
    }

    @PostMapping
    public void createClass(@RequestBody Classes classes) {
        String sql = "INSERT INTO classes (class_code, class_name) VALUES (?, ?)";
        jdbcTemplate.update(sql, classes.getClassCode(), classes.getClassName());
    }

    @PutMapping("/{class_code}")
    public void updateClasses(@PathVariable String class_code, @RequestBody Classes classes) {
        String sql = "UPDATE classes SET class_name = ? WHERE class_code = ?";
        jdbcTemplate.update(sql, classes.getClassName(), class_code);
    }

    @DeleteMapping("/{class_code}")
    public void deleteClasses(@PathVariable String class_code) {
        String sql = "DELETE FROM classes WHERE class_code = ?";
        jdbcTemplate.update(sql, class_code);
    }
}