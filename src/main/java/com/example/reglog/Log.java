package com.example.reglog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class Log {
  @Autowired repository ob;
  @GetMapping()
  public List<user> getAllNotes()
  {
	  return ob.findAll();
  }
}