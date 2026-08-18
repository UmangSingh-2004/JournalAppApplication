package com.journalApp.Umang.journalApp.controller;

import com.journalApp.Umang.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Tells Spring that this class is a REST Controller
@RestController

// Base URL for this controller will be /journal
@RequestMapping("/journal")
public class JournalEntryController {

    // HashMap is used to store JournalEntry objects temporarily
    // Long = ID of journal entry
    // JournalEntry = complete journal object
    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    // Handles GET request
    // URL: GET /journal
    @GetMapping
    public List<JournalEntry> getAll(){

        // journalEntries.values() gets all journal entries
        // ArrayList converts them into a List
        return new ArrayList<>(journalEntries.values());
    }

    // Handles POST request
    // URL: POST /journal
    @PostMapping
    public Boolean createEntry(
            // Converts incoming JSON data into JournalEntry object
            @RequestBody JournalEntry myEntry){

        // Stores journal entry in HashMap
        // Key = journal entry ID
        // Value = complete JournalEntry object
        journalEntries.put(myEntry.getId(), myEntry);

        // Returns true after adding the entry
        return true;
    }
    // Handles GET request
    @GetMapping("/id/{id}")
    public JournalEntry getJournalEntry(

            // Gets the "id" value directly from the URL path
            // Example: /journal/idf/1
            // Here id will be 1
            @PathVariable Long id){

        // Finds the JournalEntry from HashMap using the given id
        // Example: journalEntries.get(1)
        return journalEntries.get(id);
    }
    // Handles DELETE request
// Example URL: DELETE /journal/id/1
    @DeleteMapping("/id/{id}")
    public JournalEntry deleteJournalEntry(

            // Gets the id from the URL path
            // Example: /journal/id/1
            // Here id = 1
            @PathVariable Long id){

        // Removes the JournalEntry with this id from the HashMap
        return journalEntries.remove(id);
    }
    // Handles PUT request
// Example URL: PUT /journal/id/1
    @PutMapping("/id/{id}")
    public JournalEntry UpdateJournalEntry(

            // Gets the id from the URL path
            // Example: /journal/id/1
            // Here id = 1
            @PathVariable Long id,

            // Converts the JSON request body into a JournalEntry object
            @RequestBody JournalEntry myEntry){

        // Replaces the old JournalEntry with the new JournalEntry
        // IMPORTANT: put() returns the OLD JournalEntry, not the new one
        return journalEntries.put(id, myEntry);
    }
}
2332