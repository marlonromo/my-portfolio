// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;

import main.java.com.google.sps.data.FavoriteMovies;
import com.google.gson.Gson;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@WebServlet("/favoriteMovies")
public final class FavoriteMoviesServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // Calculate server stats
    String [] favoriteMovies = new String[] {"Avengers", "Transfomer", "Harry Potter"};

    // Convert the server stats to JSON
    String json = convertToJson(favoriteMovies);

    // Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }

  /*private ArrayList<FavoriteMovies> getFavoriteMovies() {
      ArrayList<FavoriteMovies> favoriteMovies = new ArrayList<>();

      favoriteMovies.add(new FavoriteMovies("Avengers"));
      favoriteMovies.add(new FavoriteMovies("Transformer"));
      favoriteMovies.add(new FavoriteMovies("Harry Potter"));

      return favoriteMovies;
  }*/



  /**
   * Converts a ServerStats instance into a JSON string using manual String concatentation.
   */
  private String convertToJson(String[] favoriteMovies) {
    StringBuilder json = new StringBuilder();
    Gson gson = new Gson();
    return gson.toJson(favoriteMovies);
  }
}