#!/usr/bin/env groovy​
/*
 * This file contains collects the similarities of the different pipelines
 * in to methods that can be loaded in by the other main pipelines.
 *
 */
{
  def pleasework(trythis) {
    sh "echo thank me it works:  $trythis"
  }
  return this
}
