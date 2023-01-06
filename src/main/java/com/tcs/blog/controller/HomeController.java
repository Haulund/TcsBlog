package com.tcs.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tcs.blog.Blog;


/**
 * HomeController
 */
@Controller
public class HomeController {

    List<Blog> blogList = new ArrayList<>();
    
    @GetMapping("/")
    public String getHomePage(Model model) {
        blogList.add(new Blog(1, "First Blog", "Steffen", "18:34:00", "This blog post shows a few different types of content that’s supported and styled with Bootstrap. Basic typography, lists, tables, images, code, and more are all supported as expected."));
        blogList.add(new Blog(1, "Second Blog", "Steffen", "18:35:10", "<p>This is some additional paragraph placeholder content. It has been written to fill the available space and show how a longer snippet of text affects the surrounding content. We'll repeat it often to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p><blockquote><p>Longer quote goes here, maybe with some <strong>emphasized text</strong> in the middle of it.</p></blockquote><p>This is some additional paragraph placeholder content. It has been written to fill the available space and show how a longer snippet of text affects the surrounding content. We'll repeat it often to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p>"));
        blogList.add(new Blog(1, "Third Blog", "Steffen", "18:36:30", "<p>This is some additional paragraph placeholder content. It has been written to fill the available space and show how a longer snippet of text affects the surrounding content. We'll repeat it often to keep the demonstration flowing, so be on the lookout for this exact same string of text.</p><ul><li>First list item</li><li>Second list item with a longer description</li><li>Third list item to close it out</li></ul><p>This is some additional paragraph placeholder content. It's a slightly shorter version of the other highly repetitive body text used throughout.</p>"));
        
        model.addAttribute("blogs", blogList);
        return "home";
    }
}