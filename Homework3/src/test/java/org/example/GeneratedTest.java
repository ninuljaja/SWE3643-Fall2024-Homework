package org.example;

import com.microsoft.playwright.junit.UsePlaywright;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.*;

import org.junit.jupiter.api.*;

@UsePlaywright
public class GeneratedTest {
    @Test
    void test(Page page) {
        page.navigate("https://demo.playwright.dev/todomvc/");
        page.navigate("https://demo.playwright.dev/todomvc/#/");
        page.getByPlaceholder("What needs to be done?").fill("Complete homework 3");
        page.getByPlaceholder("What needs to be done?").press("Enter");
        page.getByLabel("Toggle Todo").check();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Clear completed")).click();
    }
}