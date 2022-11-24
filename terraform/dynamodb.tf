resource "aws_dynamodb_table" "main" {
  name         = "main"
  billing_mode = "PAY_PER_REQUEST"
  hash_key     = "pk"
  range_key    = "sk"
  attribute {
    name = "pk"
    type = "S"
  }
  attribute {
    name = "sk"
    type = "S"
  }
  ttl {
    enabled        = true
    attribute_name = "deleted_at"
  }
}
