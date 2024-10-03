package org.example;

import com.microsoft.playwright.junit.UsePlaywright;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.*;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void test2(Page page) {
        page.navigate("https://demo.playwright.dev/todomvc/");
        page.navigate("https://demo.playwright.dev/todomvc/#/");
        page.getByPlaceholder("What needs to be done?").click();
        page.getByPlaceholder("What needs to be done?").fill("Complete homework 3");
        page.getByPlaceholder("What needs to be done?").press("Enter");
        page.getByLabel("Toggle Todo").check();
        String itemsLeftText = page.locator(".todo-count").textContent();
        assertTrue(itemsLeftText.contains("0 items left"));
    }

}